/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cobacoba;

import java.util.Scanner;
public class cobacoba1 {
    public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            
            boolean menu = true;
            
            while(menu){
                System.out.println("Menu Konversi Bilangan : ");
                System.out.println("1. Biner -> Desimal ");
                System.out.println("2. Desimal -> Biner ");
                System.out.println("3. Biner -> Hexadecimal");
                System.out.println("4. Hexadecimal -> Biner");
                System.out.println("5. Desimal -> Hexadecimal");
                System.out.println("6. Hexadecimal -> Desimal");
                System.out.println("0. Exit");
                System.out.print("Silahkan pilih menu diatas : ");
                int pilih = in.nextInt();
                
                if (pilih==1){
                 int biner,desimal=0,i=1,digit;
                 boolean konversi1 = true;
                    System.out.print("Masukkan angka biner : ");
                    biner = in.nextInt();
                    while(biner!=0){
                        digit = biner%10;
                        desimal+=(digit*i);
                        i*=2;
                        biner/=10;
                        
                    }
                    System.out.println("Angka desimal nya adalah "+desimal+"\n\n");
                    
                }
                else if(pilih==2){
                    
                     
                        int i;
                        int [] arr = new int[32];
                        
                        
                        System.out.print("Masukkan angka desimal nya : ");
                        int desimal = in.nextInt();
                        
                        for (i = 0; desimal>0; i++) {
                            arr[i] = desimal%2;
                            desimal/=2;
                        
                    }System.out.print("Angka biner nya adalah : ");
                    for (i =i-1; i>=0; i--) {
                        System.out.print(arr[i]);
                    }
                    System.out.print("\n\n");
                        
                        
                        
                    
                }else if(pilih==3){
                    System.out.print("Masukkan bilangan biner : ");
                    String biner = in.next();
                    
                    int desimal = Integer.parseInt(biner, 2);
                    String heksadesimal = Integer.toHexString(desimal).toUpperCase();
                    
                    
                    
                    System.out.print("Nilai heksadesimal nya adalah : "+heksadesimal+"\n\n");
                }else if(pilih==4){
                    System.out.print("Masukkan bilangan heksadesimalnya : ");
                    String heksadesimal = in.next();
                   
                    
                    int bin = Integer.parseInt(heksadesimal,16);
                    String biner = Integer.toBinaryString(bin);
                    System.out.print("Nilai biner nya adalah : "+ biner+"\n\n");
                   
                    
                }else if (pilih==5){
                    System.out.print("Masukkan angka desimalnya : ");
                    String desimal = in.next();
                    
                    int heksa = Integer.parseInt(desimal,10);
                    
                    String heksadesimal = Integer.toHexString(heksa).toUpperCase();
                    
                    System.out.print("Bilangan heksadesimal nya adalah : "+ heksadesimal+"\n\n");
                    
                    
                    
                    
                    
                    
                    
                    
                }else if (pilih == 6) {
                    System.out.print("Masukkan angka heksadesimal nya : ");
                    String heksadesimal = in.next();
                    
                    int wawa = Integer.parseInt(heksadesimal, 16);
                    
                    
                    System.out.print("Angka desimal nya adalah : "+wawa+"\n\n");
                } else if (pilih == 0){
                    menu = false;
                    System.out.println("Terima kasih telah menggunakan program ini");
                }  else{
                    System.out.println("Maaf angka yang anda ketik tidak terdapat pada menu di atas");
                }
                   
                 
                    
                
                    
                 
                 
                 
                    
                
            
            
            
            }
                
                
                
                    
            
            
                    
}
}