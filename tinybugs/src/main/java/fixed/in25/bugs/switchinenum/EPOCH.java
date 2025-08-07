package fixed.in25.bugs.switchinenum;

// https://github.com/apache/netbeans/issues/7437
// fixed in NB 25

public enum EPOCH {
    CLASSIC, CONTEMPORARY, NONE;

//    switch (this){ // causes exception, no error marker
//        case CLASSIC : return "Classic";
//        case CONTEMPORARY : return "Contemporary";
//        default : return "None";
//    }

}