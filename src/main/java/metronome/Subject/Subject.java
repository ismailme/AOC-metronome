package src.main.java.metronome.Subject;

import src.main.java.metronome.Observer.Observer;

/**
 * Created by H-raf on 17/11/2016.
 */
public interface Subject {

        public void attach(Observer o);
        public void notifyObservers();
        public void detach(Observer o);
}
