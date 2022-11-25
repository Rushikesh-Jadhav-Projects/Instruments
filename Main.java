package Instruments;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
abstract class Instrument
{
 abstract void play();
}
class Piano extends Instrument {
 @Override
 void play() {
 System.out.println("Piano");
 }
}
class Flute extends Instrument
{
 @Override
 void play()
 {
 System.out.println("Flute");
 }
}
class Guitar extends Instrument
{
 @Override
 void play()
 {
 System.out.println("Guitar");
 }
}
public class Main{
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 Instrument[] is = new Instrument[10];
 int a;
 a = in.nextInt();
 if (a == 1) {
 for (int i = 0; i < 10; i++) {
 is[i] = new Piano();
 }
 for (int i = 0; i < 10; i++) {
 is[i].play();
 }
 /*for (int i = 0; i < 10; i++) {
 if (is[i] instanceof Piano) {
 System.out.println("Piano is Stored at index " + 
i);
 }
 }*/
 }
 else
 if (a==2)
 {
 for (int i=0;i<10;i++)
 {
 is[i]=new Flute();
 }
 for (int i=0; i<10;i++) {
 is[i].play();
 }
 /*for (int i = 0; i < 10; i++) {
 if (is[i] instanceof Flute) {
 System.out.println("Flute is stored at index"+ 
i);
 }
 }*/
 }
 else
 {
 for (int i=0;i<10;i++)
 {
 is[i]=new Guitar();
 }
 for (int i=0;i<10;i++)
 {
 is[i].play();
 }
 /* for (int i = 0; i < 10; i++)
 {
 if (is[i] instanceof Guitar)
{
 System.out.println("Guitar is stored at index" 
+ i);
 }*/
 }
 }
}

