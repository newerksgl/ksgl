package com.newer.ksgl.model.pojo.pojopage;

import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;

public class ExasSubjectQuestionPage extends Exas {
    private Subject s;
    private Question q;

    public Subject getS() {
        return s;
    }

    public void setS(Subject s) {
        this.s = s;
    }

    public Question getQ() {
        return q;
    }

    public void setQ(Question q) {
        this.q = q;
    }
}
