import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Day1 {
    private static HashSet<Integer> frequencies = new HashSet();

    public static void main(String[] args){
        String[] input = IOutilities.readFileInputAsArray(args[0]);
        star1Solution(input);
        star2Solution(input);

    }

    public static void star1Solution(final String[] input){
        Stream<String> inputStream = streamSupplier(input);
        System.out.println(calibrateOnce(inputStream));
    }

    public static void star2Solution(final String[] input){
        System.out.println(calibrateFully(input));
    }

    public static Stream<String> streamSupplier(final String[] input){
        Supplier<Stream<String>> supplier = () -> Stream.of(input);
        return supplier.get();
    }

    public static int calibrateOnce(final Stream<String> input){
        return input.map(Integer::valueOf).reduce(Integer::sum).get();
    }


    public static int calibrateFully(final String[] input){
        Integer[] integerInput = streamSupplier(input).map(Integer::valueOf).toArray(Integer[]::new);
        return reCalibrate(integerInput);
    }


    public static int reCalibrate(final Integer[] freqChanges){
        int tmpFreq = 0;
        while(true){
            for(int freq : freqChanges){
                tmpFreq += freq;
                if(frequencies.contains(tmpFreq)){
                    return  tmpFreq;
                }else{
                    frequencies.add(tmpFreq);
                }
            }
        }
    }
}
