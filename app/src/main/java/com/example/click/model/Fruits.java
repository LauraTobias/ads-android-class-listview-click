package com.example.click.model;

import com.example.click.R;

import java.math.BigDecimal;
import java.util.HashMap;

public class Fruits {

    public Fruit[] FRUITS = {APPLE, STRAWBERRY,ORANGE,AVOCADO,WATERMELON,CHERRY,
            GRAPE,BANANA,ACAI,PLUM,COCOA, CAJU,COCONUT,CRANBERRY,FIG,RASPBERRY,JACA,
            KIWI,PASSION,JAMBO,TANGERINE,MELON,GRAPEFRUIT,VERGAMOTA,TAMARA,ROMA};

    public HashMap<String, Fruit> FRUIT_MAP =new HashMap<>();

    public Fruits() {
        for (Fruit fruit : FRUITS) {
            FRUIT_MAP.put(String.valueOf(fruit.getCode()), fruit);
        }
    }

    public static final Fruit APPLE = buildFruit("Maçã", "Avermelhada com traços verdes",R.drawable.maca);
    public static final Fruit STRAWBERRY = buildFruit("Morango","Avermelhada com traços verdes",R.drawable.morango);
    public static final Fruit ORANGE = buildFruit("Laranja","Fruta em formato esferico com coloraçaão laranja",R.drawable.laranja);
    public static final Fruit AVOCADO = buildFruit("Abacate","Fruta em formato esferico com esverdiada",R.drawable.abacate);
    public static final Fruit WATERMELON = buildFruit("Melancia","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.melancia);
    public static final Fruit CHERRY = buildFruit("Cereja","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.cereja);
    public static final Fruit GRAPE = buildFruit("Uva","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.morango);
    public static final Fruit BANANA = buildFruit("Banana","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.banana);
    public static final Fruit PLUM = buildFruit("Ameixa","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.ameixa);
    public static final Fruit COCOA = buildFruit("Cacau","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.cacau);
    public static final Fruit ACAI = buildFruit("Açaí","Fruta em formato esferico verde por fora e vermelho por dentro" ,R.drawable.acai);
    public static final Fruit CAJU = buildFruit("Caju","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.caju);
    public static final Fruit COCONUT = buildFruit("Coco","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.coco);
    public static final Fruit CRANBERRY = buildFruit("Cranberry","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.cranberry);
    public static final Fruit FIG = buildFruit("Figo","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.figo);
    public static final Fruit RASPBERRY = buildFruit("Framboesa","Fruta em formato esferico verde por fora e vermlho por dentro",R.drawable.framboesa);
    public static final Fruit JACA = buildFruit("Jaca","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.jaca);
    public static final Fruit JAMBO = buildFruit("Jambo","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.jambo);
    public static final Fruit KIWI = buildFruit("Wiki","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.kiwi);
    public static final Fruit PASSION = buildFruit("Maracuja","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.maracuja);
    public static final Fruit TANGERINE = buildFruit("Mexirica","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.mexirica);
    public static final Fruit MELON = buildFruit("Melão","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.melao);
    public static final Fruit GRAPEFRUIT = buildFruit("Toranja","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.toranja);
    public static final Fruit VERGAMOTA = buildFruit("Vergamota","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.vergamota);
    public static final Fruit TAMARA = buildFruit("Tâmara","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.tamara);
    public static final Fruit ROMA = buildFruit("Romã","Fruta em formato esferico verde por fora e vermelho por dentro",R.drawable.roma);

    private static Fruit buildFruit(String name, String description, int image) {
        return new Fruit(name, description, image, new BigDecimal(3.9), new BigDecimal(6.50),2922, new BigDecimal(4.5));
    }
};