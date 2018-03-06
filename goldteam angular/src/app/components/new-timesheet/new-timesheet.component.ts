import { Component, OnInit } from '@angular/core';
import { IMyDpOptions, IMyDateModel, IMyDayLabels } from 'angular4-datepicker/src/my-date-picker';

@Component({
  selector: 'app-new-timesheet',
  templateUrl: './new-timesheet.component.html',
  styleUrls: ['./new-timesheet.component.css']
})
export class NewTimesheetComponent implements OnInit {

  private monday: number;
  private tuesday: number;
  private wednesday: number;
  private thursday: number;
  private friday: number;


  public myDatePickerOptions: IMyDpOptions = {
    dayLabels: {su: 'Sun', mo: 'Mon', tu: 'Tue', we: 'Wed', th: 'Thu', fr: 'Fri', sa: 'Sat'},
    firstDayOfWeek: 'mon',
    editableDateField: false,
    sunHighlight: true,
    inline: false,
    disableWeekends: true,
    dateFormat: 'mm.dd.yyyy',
  };

  public model: any = { date: { year: 2018, month: 0, day: 0 } };

  constructor() { }

  ngOnInit() {
  }

  submitTimesheet() {

    console.log(this.model.date.month, this.model.date.day, this.model.date.year);
    console.log(this.monday, this.tuesday, this.wednesday, this.thursday, this.friday);

  }

}
