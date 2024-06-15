import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AshuComponent } from './ashu.component';

describe('AshuComponent', () => {
  let component: AshuComponent;
  let fixture: ComponentFixture<AshuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AshuComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AshuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
