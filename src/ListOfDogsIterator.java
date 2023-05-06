import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog> {
    List <Dog> listOfDogIterator;
    public ListOfDogsIterator(List<Dog> listOfDogIterator) {
        this.listOfDogIterator = listOfDogIterator;
    }

    private int counter;


    @Override
    public Dog next() {
        if (!hasNext())
        return null;
        return listOfDogIterator.get(counter++);
    }

    @Override
    public boolean hasNext() {
        return counter< listOfDogIterator.size()-1;
    }
}
