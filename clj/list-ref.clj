; Steve Phillips / elimisteve
; 2010.12.28

; From http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-15.html

;;; Original Lisp
;; (define (list-ref items n)
;;   (if (= n 0)
;;       (car items)
;;       (list-ref (cdr items) (- n 1))))

(defn list-ref [items n]
  (if (= n 0)
      (first items)
      (list-ref (rest items) (- n 1))))

;;; Original Lisp
;; (define squares (list 1 4 9 16 25))
;; (list-ref squares 3)
;; 16

(def squares [1 4 9 16 25])
;; (def squares (for [num (range 1 6)]
;; 	       (* num num)))
(println (list-ref squares 3))  ; 16