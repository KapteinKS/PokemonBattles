public class Main {
    public static void main (String[] args){
        long exp = 236;
        long battles = 0;
        long moreBattles = 0;
        long lvlReachedAt = 0;
        double lvl = 7;
        while (lvl < 100){
            exp += calculateEXP(lvl);
            double calculated = calculateLVL(exp);
            battles++;
            moreBattles++;
            if(calculated > lvl){
                lvl = calculated;
                lvlReachedAt = battles;
                System.out.println("Level " + lvl + " reached after " + battles + " battles, " + moreBattles + " more battles than last lvl");
                moreBattles = 0;
            }
        }
    }

    public static long calculateEXP(double lvl){
        double gained = (((122*6)/5)*((Math.pow(22, 2.5))/(Math.pow((16 + lvl),2.5)))+1);
        return (long) gained;
    }

    public static double calculateLVL (long exp){
        if ( exp < 314 && exp >= 236){
            return 7;
        } else if (exp < 419 && exp >= 314){
            return 8;
        } else if (exp < 560 && exp >= 419){
            return 9;
        } else if (exp < 742 && exp >= 560){
            return 10;
        } else if (exp < 973 && exp >= 742){
            return 11;
        } else if (exp < 1261 && exp >= 973){
            return 12;
        } else if (exp < 1612 && exp >= 1261){
            return 13;
        } else if (exp < 2035 && exp >= 1612){
            return 14;
        } else if (exp < 2535 && exp >= 2035){
            return 15;
        } else if (exp < 3120 && exp >= 2535){
            return 16;
        } else if (exp < 3798 && exp >= 3120){
            return 17;
        } else if (exp < 4575 && exp >= 3798){
            return 18;
        } else if (exp < 5460 && exp >= 4575){
            return 19;
        } else if (exp < 6458 && exp >= 5460){
            return 20;
        } else if (exp < 7577 && exp >= 6458){
            return 21;
        } else if (exp < 8825 && exp >= 7577){
            return 22;
        } else if (exp < 10208 && exp >= 8825){
            return 23;
        } else if (exp < 11735 && exp >= 10208){
            return 24;
        } else if (exp < 13411 && exp >= 11735){
            return 25;
        } else if (exp < 15244 && exp >= 13411){
            return 26;
        } else if (exp < 17242 && exp >= 15244){
            return 27;
        } else if (exp < 19411 && exp >= 17242){
            return 28;
        } else if (exp < 21760 && exp >= 19411){
            return 29;
        } else if (exp < 24294 && exp >= 21760){
            return 30;
        } else if (exp < 27021 && exp >= 24294){
            return 31;
        } else if (exp < 29949 && exp >= 27021){
            return 32;
        } else if (exp < 33084 && exp >= 29949){
            return 33;
        } else if (exp < 36435 && exp >= 33084){
            return 34;
        } else if (exp < 40007 && exp >= 36435){
            return 35;
        } else if (exp < 43808 && exp >= 40007){
            return 36;
        } else if (exp < 47846 && exp >= 43808){
            return 37;
        } else if (exp < 52127 && exp >= 47846){
            return 38;
        } else if (exp < 56660 && exp >= 52127){
            return 39;
        } else if (exp < 61450 && exp >= 56660){
            return 40;
        } else if (exp < 66505 && exp >= 61450){
            return 41;
        } else if (exp < 71833 && exp >= 66505){
            return 42;
        } else if (exp < 77440 && exp >= 71833){
            return 43;
        } else if (exp < 83335 && exp >= 77440){
            return 44;
        } else if (exp < 89523 && exp >= 83335){
            return 45;
        } else if (exp < 96012 && exp >= 89523){
            return 46;
        } else if (exp < 102810 && exp >= 96012){
            return 47;
        } else if (exp < 109923 && exp >= 102810){
            return 48;
        } else if (exp < 117360 && exp >= 109923){
            return 49;
        } else if (exp < 125126 && exp >= 117360){
            return 50;
        } else if (exp < 133229 && exp >= 125126){
            return 51;
        } else if (exp < 141677 && exp >= 133229){
            return 52;
        } else if (exp < 150476 && exp >= 141677){
            return 53;
        } else if (exp < 159635 && exp >= 150476){
            return 54;
        } else if (exp < 169159 && exp >= 159635){
            return 55;
        } else if (exp < 179056 && exp >= 169159){
            return 56;
        } else if (exp < 189334 && exp >= 179056){
            return 57;
        } else if (exp < 199999 && exp >= 189334){
            return 58;
        } else if (exp < 211060 && exp >= 199999){
            return 59;
        } else if (exp < 222522 && exp >= 211060){
            return 60;
        } else if (exp < 234393 && exp >= 222522){
            return 61;
        } else if (exp < 246681 && exp >= 234393){
            return 62;
        } else if (exp < 259392 && exp >= 246681){
            return 63;
        } else if (exp < 272535 && exp >= 259392){
            return 64;
        } else if (exp < 286115 && exp >= 272535){
            return 65;
        } else if (exp < 300140 && exp >= 286115){
            return 66;
        } else if (exp < 314618 && exp >= 300140){
            return 67;
        } else if (exp < 329555 && exp >= 314618){
            return 68;
        } else if (exp < 344960 && exp >= 329555){
            return 69;
        } else if (exp < 360838 && exp >= 344960){
            return 70;
        } else if (exp < 377197 && exp >= 360838){
            return 71;
        } else if (exp < 394045 && exp >= 377197){
            return 72;
        } else if (exp < 411388 && exp >= 394045){
            return 73;
        } else if (exp < 429235 && exp >= 411388){
            return 74;
        } else if (exp < 447591 && exp >= 429235){
            return 75;
        } else if (exp < 466464 && exp >= 447591){
            return 76;
        } else if (exp < 485862 && exp >= 466464){
            return 77;
        } else if (exp < 505791 && exp >= 485862){
            return 78;
        } else if (exp < 526260 && exp >= 505791){
            return 79;
        } else if (exp < 547274 && exp >= 526260){
            return 80;
        } else if (exp < 568841 && exp >= 547274){
            return 81;
        } else if (exp < 590969 && exp >= 568841){
            return 82;
        } else if (exp < 613664 && exp >= 590969){
            return 83;
        } else if (exp < 636935 && exp >= 613664){
            return 84;
        } else if (exp < 660787 && exp >= 636935){
            return 85;
        } else if (exp < 685228 && exp >= 660787){
            return 86;
        } else if (exp < 710266 && exp >= 685228){
            return 87;
        } else if (exp < 735907 && exp >= 710266){
            return 88;
        } else if (exp < 762160 && exp >= 735907){
            return 89;
        } else if (exp < 789030 && exp >= 762160){
            return 90;
        } else if (exp < 816525 && exp >= 789030){
            return 91;
        } else if (exp < 844653 && exp >= 816525){
            return 92;
        } else if (exp < 873420 && exp >= 844653){
            return 93;
        } else if (exp < 902835 && exp >= 873420){
            return 94;
        } else if (exp < 932903 && exp >= 902835){
            return 95;
        } else if (exp < 963632 && exp >= 932903){
            return 96;
        } else if (exp < 995030 && exp >= 963632){
            return 97;
        } else if (exp < 1027103 && exp >= 995030){
            return 98;
        } else if (exp < 1059860 && exp >= 1027103){
            return 99;
        } else {
            return 100;
        }
    }
}
