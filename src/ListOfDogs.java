import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfDogs implements Iterable<Dog> {
    private List <Dog> listOfDogs;

    public List<Dog> getListOfDogs() {
        return listOfDogs;
    }

    public void setListOfDogs(List<Dog> listOfDogs) {
        this.listOfDogs = listOfDogs;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new  ListOfDogsIterator(listOfDogs);
    }
}
