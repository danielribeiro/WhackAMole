(ns whackmole)

(def score (atom 0))

(defn jq [arg] (js/jQuery arg))

(defn log [arg] (.log js/console arg))

(defn display-score [arg]
  (.html (jq "#score") (str arg)))

(defn bind-events [] (.click (jq ".hole")
                       (fn [this]
                         (when (.hasClass (jq (.-target this)) "holeWithMole" )
                            (.removeClass (jq (.-target this)) "holeWithMole" )
                            (swap! score inc)
                            (display-score @score)
                            )

                         )))

(defn mole-at [n] (.addClass (jq (.get (jq ".hole") n)) "holeWithMole" ))

(js/jQuery bind-events)

(js/setInterval  (fn [] (mole-at (rand-int 4) ) ) 1000 )

