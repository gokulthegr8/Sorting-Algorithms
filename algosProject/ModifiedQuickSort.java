package algosProject;

public class ModifiedQuickSort {

 
    public static final int CUTOFF = 10;

    public static void quicksort( Comparable [ ] a, int low, int high ) {
        if( low + CUTOFF > high )
            insertionSort( a, low, high );
        else {
            // Sort low, middle, high
            int middle = ( low + high ) / 2;
            if( a[ middle ].compareTo( a[ low ] ) < 0 )
                swap( a, low, middle );
            if( a[ high ].compareTo( a[ low ] ) < 0 )
                swap( a, low, high );
            if( a[ high ].compareTo( a[ middle ] ) < 0 )
                swap( a, middle, high );
             
            swap( a, middle, high - 1 );
            Comparable pivot = a[ high - 1 ];
             
            int i, j;
            for( i = low, j = high - 1; ; ) {
                while( a[ ++i ].compareTo( pivot ) < 0 )
                    ;
                while( pivot.compareTo( a[ --j ] ) < 0 )
                    ;
                if( i >= j )
                    break;
                swap( a, i, j );
            }
             
            swap( a, i, high - 1 );
             
            quicksort( a, low, i - 1 );    
            quicksort( a, i + 1, high );   
        }
    }

    public static final void swap( Object [ ] a, int index1, int index2 ) {
        Object tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

    private static void insertionSort( Comparable [ ] a, int low, int high ) {
        for( int p = low + 1; p <= high; p++ ) {
            Comparable tmp = a[ p ];
            int j;
             
            for( j = p; j > low && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }
}
