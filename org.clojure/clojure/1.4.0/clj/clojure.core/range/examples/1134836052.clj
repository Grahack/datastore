;; finite range over java Integers
(take 5 (range 42 (java.lang.Integer/MAX_VALUE)))
;; => (42 43 44 45 46)

;; infinite range starting at a certain point
(take 5 (drop 42 (range)))
;; => (42 43 44 45 46)
