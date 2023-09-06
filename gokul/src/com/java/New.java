package com.java;
try {
    File obj = new File("E:\\myfile.txt");
//    File obj = new File("E:\\myexcercise.txt");

    Scanner myReader = new Scanner(obj);

    while(myReader.hasNextLine()) {

        String data=myReader.nextLine();

        System.out.println(data);

        myReader.close();
    }
    } catch (FileNotFoundException e) {

        System.out.println("An error occour here ");

        e.printStackTrace();    // it will check each and every line of the code 

  }

  }
}