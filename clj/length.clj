; Steve Phillips / fraktil
; 2010.12.28

; From http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-15.html

;; (define (length items)
;;   (if (null? items)
;;       0
;;       (+ 1 (length (cdr items)))))

;; (define odds (list 1 3 5 7))
;; (length odds)
;; 4

(defn length [items]
  (if (empty? items)
      0
      (+ 1 (length (rest items)))))

(def odds [1 3 5 7])

(println (length odds))  ; 4