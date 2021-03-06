import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
//import {MatIconModule} from '@angular/material';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { ExcelService } from './services/excel.service';

@NgModule({
  imports:      [ BrowserModule, FormsModule,],
  declarations: [ AppComponent, HelloComponent ],
  bootstrap:    [ AppComponent ],
  providers: [ExcelService]
})
export class AppModule { }
