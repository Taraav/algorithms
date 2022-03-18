package org.pg4200.ex04;

import org.pg4200.les03.sort.MySort;
import org.pg4200.les03.sort.SortTestTemplate;

public class MixedSort1Test extends SortTestTemplate {
    @Override
    protected MySort getInstance() {
        return new MixedSort1();
    }
}
