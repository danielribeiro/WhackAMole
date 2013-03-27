(ns whackmole)

;(defn drawMole [index]
;  (js/jQuery )
;  )


(defn bind-events [] (.click (js/jQuery ".hole")
                       (fn [this]
                         (.removeClass (js/jQuery (.-target this)) "holeWithMole" )

                         )))

(js/jQuery bind-events)

