package com.mcnz

public class FileTest {

  def buildrelease() {
    def file = new File("https://github.com/b4u-mark/Shared-Library.git")
    file.eachFileRecurse (FileType.FILES) { rel_file ->
    fileList << rel_file
    }
    if (rel_file.exists()){
      return true;
    }
    else {
      println "File does not exist."
    }
    
    return false;
  }

}