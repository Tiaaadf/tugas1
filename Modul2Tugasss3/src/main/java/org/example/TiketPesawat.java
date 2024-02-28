package org.example;

import org.example.Tugas.tgs4.info;

public class TiketPesawat extends Pemesanan {

    public TiketPesawat(info info) {
        super(info.nama(), info.asal(), info.tujuan(), info.hargatiket(), info.diskon());
    }

}

