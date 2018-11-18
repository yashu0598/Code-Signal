boolean charactersRearrangement(String string1, String string2) {
        boolean correct = true;

        char[] characters1 = string1.toCharArray();
        char[] characters2 = string2.toCharArray();

        Arrays.sort(characters1);
        Arrays.sort(characters2);

        for (int i = 0; i < Math.max(characters1.length, characters2.length); i++) {
            if (i >= characters1.length || i >= characters2.length || characters1[i] != characters2[i]) {
                correct = false;
                break;
            }
        }

        return correct;
    }
