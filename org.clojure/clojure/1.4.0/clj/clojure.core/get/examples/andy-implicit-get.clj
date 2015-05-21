;; Clojure allows you to leave out the 'get' to achieve a more concise
;; syntax for vectors and maps.  Differences:
;; 
;; * No not-found value vectors.  You may use one for maps.
;; * (my-vector idx) will throw an exception if idx is not an integer, or
;;   out of the bounds for the vector.
;; * It does not work for records, strings, or Java Maps or arrays.
;; 

(def vec1 [:a :b :c])
;; => #'user/vec1

(vec1 2)
;; => :c

(vec1 3)
;; => IndexOutOfBoundsException   clojure.lang.PersistentVector.arrayFor (PersistentVector.java:107)

(vec1 3 :not-found)
;; => ArityException Wrong number of args (2) passed to: PersistentVector  clojure.lang.AFn.throwArity (AFn.java:437)

(def map1 {:a 1 :b 2})
;; => #'user/map1

(map1 :a)
;; => 1

(map1 :c)
;; => nil

(map1 :c :not-found)
;; => :not-found
