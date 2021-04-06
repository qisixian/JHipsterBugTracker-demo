import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'jhi-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.scss'],
})
export class DemoComponent implements OnInit {
  //  constructor() { }
  demoString = '123';

  ngOnInit(): void {
    this.demoString = 'demo';
  }
}
