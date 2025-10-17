package Lesson_6_practice;

public class Car {
        private int guc, model;
        public int suret;
        protected String color;

        Car(){
            this.model = 2020;
            this.guc = 300;
            this.suret = 120;
            this.color = "qirmizi";
        }

        private void print(){
            System.out.println(model);
        }

        public void run(){
            print();
        }









}
