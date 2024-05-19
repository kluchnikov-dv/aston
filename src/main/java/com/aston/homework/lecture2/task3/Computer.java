package com.aston.homework.lecture2.task3;


public class Computer {    

    private String annonceRAM = "Объём памяти компьютера: ";
    private static String annonceProcessor = "Модель процессора: ";
    
    static class Processor {
        
        String model;

        String getDetails(){
            return model;
        }

        Processor(String model) {
            this.model = annonceProcessor + model; //нельзя добавить annonceRAM (статические классы могут обращаться только к статическим полям)
        }
    }

    class RAM {
        
        String size;

        String getDetails() {
            return size;
        }

        RAM(String size) {
            this.size = annonceRAM + size;
        }
    }

}
