import entidades.No;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest<result> {
    No a = new No("A");
    No b = new No("B");
    No c = new No("C");
    No d = new No("D");
    No e = new No("E");
    No f = new No("F");

        a.addAdjacente(b);
        b.addAdjacente(c);
        b.addAdjacente(d);
        e.addAdjacente(f);

    List<No> result = new ArrayList<>();
        e.buscaProfundidade(result);

        for (No n : result) {
        System.out.print(n+" ");
    }
}


