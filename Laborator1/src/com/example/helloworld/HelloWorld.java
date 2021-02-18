package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        //Afisam Hello World
        System.out.println("Hello,World");

        //Definim array-ul cu stringuri
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        //Generam un numar random
        int n = (int) (Math.random() * 1_000_000);
        System.out.println("Numarul random este:" + n);

        //Inmultim nr cu 3
        n=n*3;
        System.out.println("Triplam numarul"+n);

        //Adugam numarul din binar
        String binaryString="10101";
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println("Nr de adaugat din binar in zecimal:" + decimal);
        n=n+decimal;
        System.out.println("Suma:" + n);

        //Adaugam numarul din hexa
        String hex="FF";
        int decimal2=Integer.parseInt(hex,16);
        System.out.println("Numarul hex de adaugat:"+decimal2);
        n=n+decimal2;
        System.out.println("Suma:" +n);

        //Inmultim cu 6
        n=n*6;
        System.out.println("Numarul final este :" +n);

        //Calculam suma cifrelor numarului calculat anterior
        int suma=0;
        while(n>0){
            suma=suma+n%10;
            n=n/10;
        }

        //Repetam procesul de mai multe ori pentru ca e posibil ca suma calculata anterior
        //sa fie formata din 2 cifre
        int s=0;
        int s1=0;
        int result=0;
        if (suma<9){
            result=suma;
        }
        else if (suma > 9) {
            while (suma > 0) {
                s = s + suma % 10;
                suma = suma / 10;
            }
            result=s;
        }
        else if (s > 9) {
            while (s > 0) {
                s1 = s1 + s % 10;
                s = s / 10;
            }
            result=s1;
        }
        System.out.println(result);

        //Afisam propozitia care va fi mereu la final cu "Java"
        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);

    }
}

