import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MadhurComponent } from './madhur.component';

describe('MadhurComponent', () => {
  let component: MadhurComponent;
  let fixture: ComponentFixture<MadhurComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MadhurComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MadhurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
