# Missionary: A Clojure Library for Conversion

Write at most two conversion functions per unit and be able to convert between any compatible unit.

## Usage

*Something something graph something....*

Write a conversion function for each of your units to and from at least one other unit, and make sure all units are connected to all other units via other conversions.

The likely simplest way to do this is to pick one unit as the go-between, and write a conversion to and from that one unit.

`[ft-in in-ft ft-yd yd-ft ft-mi]` is a bad set of conversions because `ft-mi` strands the graph at miles. There's no conversion back out of miles. Writing the function `mi-ft` allows us to bridge back to the graph and infer the conversions `[in-mi mi-in in-yd yd-in]`.

