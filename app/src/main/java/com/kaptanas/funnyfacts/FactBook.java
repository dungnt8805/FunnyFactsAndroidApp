package com.kaptanas.funnyfacts;

import java.util.Random;

/**
 * Created by cnkaptan on 08/24/14.
 */
public class FactBook {


    public String[] mFacts = {
            "Karıncalar uyandıkları zaman insanlar gibi gerinirler.",
            "Devekuşları atlardan daha hızlı koşabilir.",
            "Olimpiyat altın madalyalarının büyük çocuğunluğu gümüştür.",
            "İnsanların doğduğunda 300 kemiği olmasına rağmen yetişkinken 206 kemiğe sahiptir.",
            "Güneş ışınlarının dünyaya ulaşması yaklaşık 8 dakika sürer.",
            "Bazı Bamboo ağaçları günde 1 metre büyüyebilir.",
            "Florida eyaleti İngiletere'den daha fazla yüzölçümüne sahiptir.",
            "Bazı penguenler suyun 2-3 metre üzerine sıçrayabilir.",
            "Bir alışkanlığın kazanılması için geçen süre 66 gündür.",
            "Mısır piramitleri yapılırken mamutlar hala yaşıyordu." };


    public String getFact() {

        String fact = "";

        // Randomly select a fact
        // Diziden rastgele fact seçimi
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
