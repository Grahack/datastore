(take-while neg? [-2 -1 0 1 2 3])
;; => (-2 -1)

(take-while neg? [-2 -1 0 -1 -2 3])
;; => (-2 -1)

(take-while neg? [ 0 1 2 3])
;; => ()

(take-while neg? [])
;; => ()

(take-while neg? nil)
;; => ()
