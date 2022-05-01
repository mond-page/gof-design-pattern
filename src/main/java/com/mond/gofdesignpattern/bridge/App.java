package com.mond.gofdesignpattern.bridge;

import com.mond.gofdesignpattern.bridge.champion.Akali;
import com.mond.gofdesignpattern.bridge.champion.Ari;
import com.mond.gofdesignpattern.bridge.champion.Champion;
import com.mond.gofdesignpattern.bridge.skin.KdaSkin;
import com.mond.gofdesignpattern.bridge.skin.PoolPartySkin;

public class App {
    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KdaSkin());
        kdaAri.skillQ();
        kdaAri.skillW();

        Champion pollPartyAkali = new Akali(new PoolPartySkin());
        pollPartyAkali.move();
        pollPartyAkali.skillR();
    }
}
