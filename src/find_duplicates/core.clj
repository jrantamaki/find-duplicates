(ns find-duplicates.core
   (:gen-class)) ;; dont forget this...

(defn get-files[directory]
  "Get a sequence of files in a specified directory."
  (remove #(.isDirectory %) (file-seq  (clojure.java.io/file directory))))

(defn group-by-file-name[files]
  "Group files by the file name. "
  (seq (group-by #(.getName %) files)))

(defn print-duplicates[all-files]
  "Print out the duplicates and their file sizes."
  (doseq [[key files] (group-by-file-name all-files)]
    (when (< 1 (count files))
      (println "")
      (doseq [f  files]
        (println (.length f) " " (str f))))))

(defn -main[& args] 
  (if (empty? args) 
    (println "I need one directory as an input parameter. ")
    (let [all-files (get-files (first args))]
      (print-duplicates all-files))))

