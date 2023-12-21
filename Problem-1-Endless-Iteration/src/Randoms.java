
import java.util.Iterator;


public class Randoms implements Iterable<Integer> {
        public int min;
        public int max;
        protected Randoms random;
        public Randoms(int min, int max) {
                this.min = min;
                this.max = max;
        }
        @Override
        public Iterator<Integer> iterator() {
               return new Iterator<>() {
                       private int random;
                       @Override
                       public boolean hasNext() {
                               return false;
                       }
                       @Override
                       public Integer next() {
                               random = (int) (Math.random()*(max)) + min;
                               return random;
                       }
               };
        }

}
