;; `*print-dup*` is very handy when we want to write clojure code/data
;; to a file to read it in later.

(defn serialize
  "Print a data structure to a file so that we may read it in later."
  [data-structure #^String filename]
  (with-out-writer
    (java.io.File. filename)
    (binding [*print-dup* true] (prn data-structure))))
;; => #'user/serialize

;; This allows us to then read in the structure at a later time, like so:
(defn deserialize [filename]
  (with-open [r (PushbackReader. (FileReader. filename))]
    (read r)))
;; => #'user/deserialize

(serialize {:name "Fred" :age "23"} "config.clj")
;; => nil

(deserialize "config.clj")
;; => {:name "Fred", :age "23"}
