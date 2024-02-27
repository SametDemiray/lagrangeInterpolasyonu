package org.example;

// İlk kez Uygulamalı Matematik biliminin bir alt kategorisi olan Sayısal Analiz yöntemlerinde tanımlanan ve elde var olan (bilinen) değer
// noktalarından yola çıkarak bu noktalar arasında, farklı bir yerde ve değeri bilinmeyen bir noktadaki olası değeri bulmaya/tahmin etmeye
// yarayan yöntemlerin tümüne verilen genel isimdir. En basit tanımı ile "var olan sayısal değerleri kullanarak, boş noktalardaki
// değerlerin tahmin edilmesi" olarak açıklanmaktadır. Türkçede bazen kolaylık olsun diye "interpolasyon" sözcüğü yerine yalnızca "tahmin"
// de kullanılmaktadır.
//İnterpolasyon genelde mühendislik ve deneylere/ölçümlere dayalı benzeri bilim dallarında, toplanan verilerin bir fonksiyon eğrisine
// uydurulması amacıyla kullanılmaktadır.Elde toplanan verinin dağınık ve özellikle aşırı heterojen olduğu durumlarda interpolasyon
// ile boş alanlardaki değerlerin bulunması önem kazanmaktadır.
// Ekstrapolasyon bilinen noktaların dışındaki bir alanda da tahmin yapmak için kullanılır.

// Klavyeden girilen n adet bilinen değeri kullanarak aradaki istenen değeri, "Lagrange Enterpolasyonu"yla hesaplayan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, n;
        float xt, s, t = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNokta Sayısını giriniz : ");
        n = scanner.nextInt();
        float[] x = new float[n];
        float[] y = new float[n];

        for (i = 0; i < n; i++) {
            System.out.printf("x(%d) : ", i);
            x[i] = scanner.nextFloat();
            System.out.printf("y(%d) : ", i);
            y[i] = scanner.nextFloat();
        }
        System.out.print("Aradaki Tahmin Edilecek Değeri Giriniz : ");

        xt = scanner.nextFloat();

        for (i = 0; i < n; i++) {
            s = y[i];
            for (j = 0; j < n; j++) {
                if (i != j)
                    s = s * (xt - x[j]) / (x[i] - x[j]);
            }
            t += s;
        }

        System.out.printf("Hesaplanan Tahmini Değer : %.10f\n", t);
    }
}