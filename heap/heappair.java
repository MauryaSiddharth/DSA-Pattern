import java.util.PriorityQueue;

class Pair {
    int first;
    String second;

    Pair(int f, String s) {
        first = f;
        second = s;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class heappair {
    public static void main(String[] args) {

        // Min heap on first, then min heap on second
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first)
                return Integer.compare(a.first, b.first);
            return a.second.compareTo(b.second);
        });

        pq.add(new Pair(2, "apple"));
        pq.add(new Pair(1, "banana"));
        pq.add(new Pair(2, "cat"));
        pq.add(new Pair(1, "ant"));

        System.out.println("Min-First Min-Second:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


        // Min heap on first, max heap on second
        PriorityQueue<Pair> minmax = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first)
                return Integer.compare(a.first, b.first);
            return b.second.compareTo(a.second);
        });

        minmax.add(new Pair(2, "apple"));
        minmax.add(new Pair(1, "banana"));
        minmax.add(new Pair(2, "cat"));
        minmax.add(new Pair(1, "ant"));

        System.out.println("\nMin-First Max-Second:");
        while (!minmax.isEmpty()) {
            System.out.println(minmax.poll());
        }

        //  same for max heap max heap and max heap min heap (condition changes )
    }
}


// import java.util.PriorityQueue;

// class Pair{
//         int first;
//         String second;

//          Pair(int f ,String s){
//         first = f;
//         second = s;
//     }
//     }

// public class heappair{
//     public static void main(String[] args) {
//     //     with help of comparator we can do max 0r min
//     PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
//         if(a.first!= b.first) return a.first-b.first;  // min heap on first
//         return a.second.compareTo(b.second)  ;             // min heap on second
//     });

//     //  min on first and max on second

//     PriorityQueue<Pair> minmax = new PriorityQueue<>((a,b)->{
//         if(a.first!=b.first) return a.first-b.first;
//         return b.second.compareTo(a.second);
//     });

//     //  same for max max and max min changes



        
//     }
// } 