package Entities;

import java.util.Date;

public class Practice {
    private Date date;
    private Trainer trainer;

    public Practice(Date date, Trainer trainer) {
        this.date = date;
        this.trainer = trainer;
    }

    public Date getDate() {
        return this.date;
    }

    public Trainer getTrainer() {
        return this.trainer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
