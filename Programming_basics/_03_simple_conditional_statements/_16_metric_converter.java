import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _16_metric_converter {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
double input = Double.parseDouble(console.nextLine());
double result=0;


String fUnit = console.nextLine();
String sUnit = console.nextLine();
       if(fUnit.equals("mm")) {

           if (sUnit.equals("mm")) {
               result = input;
           }
           if (sUnit.equals( "cm")) {
               result = input / 10;
           }

           if (sUnit.equals("mi")) {
               result = 0.000621371192 * input / 1000;
           }
           if (sUnit.equals( "in")) {
               result = 39.3700787 * input / 1000;
           }
           if (sUnit.equals("km")) {
               result = input / 1000/1000;
           }
           if (sUnit.equals( "ft")) {
               result = 3.2808399 * input / 1000;
           }
           if (sUnit.equals( "yd")) {
               result = 1.0936133 * input / 1000;
           }
           if (sUnit.equals( "m")) {
               result = input / 1000;
           }
       }
        else if(fUnit.equals("m")) {

            if (sUnit.equals("mm")) {
                result = 1000*input;
            }
            if (sUnit.equals( "cm")) {
                result = 100*input ;
            }

            if (sUnit.equals("mi")) {
                result = 0.000621371192 * input;
            }
            if (sUnit.equals( "in")) {
                result = 39.3700787 * input;
            }
            if (sUnit.equals("km")) {
                result = 0.001 * input ;
            }
            if (sUnit.equals( "ft")) {
                result = 3.2808399 * input;
            }
            if (sUnit.equals( "yd")) {
                result = 1.0936133 * input ;
            }
            if (sUnit.equals( "m")) {
                result = input ;
            }
        }
       else if(fUnit.equals("cm")) {

            if (sUnit.equals("mm")) {
                result = 10*input;
            }
            if (sUnit.equals( "cm")) {
                result = input ;
            }

            if (sUnit.equals("mi")) {
                result = 0.000621371192 * input / 100;
            }
            if (sUnit.equals( "in")) {
                result = 39.3700787 * input / 100;
            }
            if (sUnit.equals("km")) {
                result = 0.001 * input / 100;
            }
            if (sUnit.equals( "ft")) {
                result = 3.2808399 * input / 100;
            }
            if (sUnit.equals( "yd")) {
                result = 1.0936133 * input / 100;
            }
            if (sUnit.equals( "m")) {
                result = input / 100;
            }
        } else if(fUnit.equals("mi")) {

           if (sUnit.equals("mm")) {
               result = input/0.000621371192*1000;
           }
           if (sUnit.equals( "cm")) {
               result = input / 0.000621371192*100;
           }

           if (sUnit.equals("mi")) {
               result =  input ;
           }
           if (sUnit.equals( "in")) {
               result = 39.3700787 * input / 0.000621371192;
           }
           if (sUnit.equals("km")) {
               result = 0.001 * input / 0.000621371192;
           }
           if (sUnit.equals( "ft")) {
               result = 3.2808399 * input / 0.000621371192;
           }
           if (sUnit.equals( "yd")) {
               result = 1.0936133 * input / 0.000621371192;
           }
           if (sUnit.equals( "m")) {
               result = input / 0.000621371192;
           }
       }else  if(fUnit.equals("in")) {

           if (sUnit.equals("mm")) {
               result = input/39.3700787*1000;
           }
           if (sUnit.equals( "cm")) {
               result = input /39.3700787*100;
           }

           if (sUnit.equals("mi")) {
               result = 0.000621371192* input /39.3700787;
           }
           if (sUnit.equals( "in")) {
               result =  input ;
           }
           if (sUnit.equals("km")) {
               result =  1000* input /39.3700787;
           }
           if (sUnit.equals( "ft")) {
               result = 33.2808399*input /39.3700787  ;
           }
           if (sUnit.equals( "yd")) {
               result = 1.093613 * input /33.2808399  ;
           }
           if (sUnit.equals( "m")) {
               result = input / 39.3700787;
           }
       } else  if(fUnit.equals("km")) {

        if (sUnit.equals("mm")) {
            result = input*1000*1000;
        }
        if (sUnit.equals( "cm")) {
            result = input *1000*100;
        }

        if (sUnit.equals("mi")) {
            result =  input /0.000621371192*1000;
        }
        if (sUnit.equals( "in")) {
            result =  39.3700787*input*1000 ;
        }
        if (sUnit.equals("km")) {
            result =   input;
        }
        if (sUnit.equals( "ft")) {
            result = 33.2808399*input*1000  ;
        }
        if (sUnit.equals( "yd")) {
            result = 1.0936133 * input *1000 ;
        }
        if (sUnit.equals( "m")) {
            result = input *1000;
        }
    }else  if(fUnit.equals("ft")) {

            if (sUnit.equals("mm")) {
                result = input*3.2808399*1000;
            }
            if (sUnit.equals( "cm")) {
                result = input *3.2808399*100;
            }

            if (sUnit.equals("mi")) {
                result =  input /0.000621371192*3.2808399;
            }
            if (sUnit.equals( "in")) {
                result =  39.3700787*input*3.2808399 ;
            }
            if (sUnit.equals("km")) {
                result =  3.2808399* input/1000;
            }
            if (sUnit.equals( "ft")) {
                result = input ;
            }
            if (sUnit.equals( "yd")) {
                result = 1.093613 * input *3.2808399;
            }
            if (sUnit.equals( "m")) {
                result = input *3.2808399;
            }
        }else  if(fUnit.equals("yd")) {

           if (sUnit.equals("mm")) {
               result = input*1000*1.0936133;
           }
           if (sUnit.equals( "cm")) {
               result = input *1.0936133*100;
           }

           if (sUnit.equals("mi")) {
               result =  input /0.000621371192*1.0936133;
           }
           if (sUnit.equals( "in")) {
               result =  39.3700787*input*1.0936133 ;
           }
           if (sUnit.equals("km")) {
               result =  1.0936133* input/1000;
           }
           if (sUnit.equals( "ft")) {
               result = 33.2808399*input*1.0936133  ;
           }
           if (sUnit.equals( "yd")) {
               result =  input  ;
           }
           if (sUnit.equals( "m")) {
               result = input *1.0936133;
           }
       }


        System.out.printf("%f",result);

    }

    }