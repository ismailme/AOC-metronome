package src.main.java.metronome.Subject;

import src.main.java.metronome.Observer.Observer;

/**
 * Subject
 */
public interface Subject {
        /**
         *
         * @param o
         */
        public void attach(Observer o);

        /**
         *
         */
        public void notifyObservers();

        /**
         *
         * @param o
         */
        public void detach(Observer o);
}
