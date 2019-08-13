package com.newer.ksgl.model.pojo.pojopage;

import com.newer.ksgl.model.pojo.Ccertificatestatus;
import com.newer.ksgl.model.pojo.Certificate;
import com.newer.ksgl.model.pojo.Usercertificate;

import java.io.Serializable;

public class UsercertificatePage extends Usercertificate {
    private Certificate certificate;
    private Ccertificatestatus ccertificatestatus;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Ccertificatestatus getCertificatestatus() {
        return ccertificatestatus;
    }

    public void setCertificatestatus(Ccertificatestatus ccertificatestatus) {
        this.ccertificatestatus = ccertificatestatus;
    }
}
