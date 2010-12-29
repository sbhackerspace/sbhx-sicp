; Steve Phillips / elimisteve
; 2010.12.29

; From http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-15.html

;; Use this notation to write a procedure same-parity that takes one
;; or more integers and returns a list of all the arguments that have
;; the same even-odd parity as the first argument. For example,

;; (same-parity 1 2 3 4 5 6 7)
;; (1 3 5 7)

;; (same-parity 2 3 4 5 6 7)
;; (2 4 6)


(defn same-parity [& numbers]
  (if (even? (first numbers))
    (filter even? numbers)
    (filter odd? numbers)))

(println (same-parity 1 2 3 4 5 6 7))  ; (1 3 5 7)

(println (same-parity 2 3 4 5 6 7))  ; (2 4 6)