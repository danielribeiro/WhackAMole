(ns whackmole)

;(defn drawMole [index]
;  (js/jQuery )
;  )


(defn bind-events [] (.click (js/jQuery ".hole")
                       (fn [this]
                         (.removeClass (js/jQuery (.-target this)) "holeWithMole" )

                         )))

(defn mole-at [n] (.addClass (js/jQuery (.get (js/jQuery ".hole") n)) "holeWithMole" ))

(js/jQuery bind-events)
(js/jQuery (fn [] (mole-at (rand-int 4) ) ))

