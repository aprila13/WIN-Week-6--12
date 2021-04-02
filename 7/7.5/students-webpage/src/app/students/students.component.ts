import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

import { StudentService } from '../student.service';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  students?: Student[];

  selectedStudent?: Student;

  constructor(private studentService: StudentService, private messageService: MessageService) { }

  getStudents(): void {
    this.studentService.getStudents()
        .subscribe(students => this.students = students);
  }

  ngOnInit() {
    this.getStudents();
  }

  onSelect(student: Student): void {
    this.selectedStudent = student;
    this.messageService.add(`StudentComponent: Selected hero id=${student.id}`);
  }
}