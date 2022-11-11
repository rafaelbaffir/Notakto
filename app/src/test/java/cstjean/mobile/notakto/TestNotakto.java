package cstjean.mobile.notakto;

import android.widget.Button;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class TestNotakto {
    private final Button[] boutons = new Button[9];
    AtomicInteger joueur = new AtomicInteger(1);
    AtomicReference<Boolean> partieTerminer = new AtomicReference<>(false);

}
