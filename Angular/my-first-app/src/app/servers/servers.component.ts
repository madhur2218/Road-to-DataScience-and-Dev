import { Component } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrl: './servers.component.css'
})
export class ServersComponent {
  serverId: number = 2;
  serverStatus: boolean = false;
  allowNewServer=false;

  constructor(){
    setTimeout(()=>{
      this.allowNewServer= true;
    }, 2000)
  }

  getServerStatus(){
    return  this.serverStatus;
  }
}
