import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  username = '';
  emptyUsername = true

  onReset() {
    this.username = '';
    this.emptyUsername = true
  }

  onUpdateUsername() {
    if ((this.username = (<HTMLInputElement>event.target).value) != '') {
      this.emptyUsername = false
    }
  }

}



