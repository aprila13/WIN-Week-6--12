import { Injectable } from '@angular/core';
import { Student } from './student';
import { STUDENTS } from './mock-students';
import { Observable, of } from 'rxjs';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  getStudents(): Observable<Student[]> {
    this.messageService.add('MessageService: fetched service');
    return of(STUDENTS);
  }
 
  constructor(private messageService: MessageService) { }
}
