# EasyDipreo 

## Introduction

The core principle behind our ‘EasyDipreo’ Accounting Package is “Accumulated Depreciation,” a key concept in accounting's subsequent measurements. Our understanding of this concept has been greatly enhanced by the classroom lectures from the IS-1210 module, particularly the lecture on “Property, Plant, and Equipment.” This lecture covered the fundamentals of accumulated depreciation, its real-world applications, and various methods for calculating it, all of which have been instrumental in the development of this software package.

## Accumulated Depreciation

Accumulated Depreciation refers to the systematic allocation of the depreciable amount of an asset over its useful life.

## Methods of Calculating Depreciation

There are three primary methods for calculating depreciation:

### 1. Straight Line Basis (SLB) Method

This method requires the cost, scrap value, and useful life of the asset. Depreciation is calculated using the following formula:

Depreciation = (Cost - Scrap Value) / Useful Life


### 2. Reducing Balance Basis (RBB) Method

This method also requires the cost, scrap value, and useful life of the asset. First, the depreciation rate is calculated using the following formula:

Rate = [1 - (Scrap Value / Cost)^(1/n)] x 100%


Where `n` is the useful life of the asset in years.

After calculating the rate, the depreciation for each year is calculated as follows, where the carrying value for the first year is equal to the cost value:

Depreciation = Carrying Value x Rate


### 3. Production Unit Basis (PUB) Method

This method requires the cost, scrap value, and production units for each year. First, calculate the total production units. Depreciation is then calculated using the following formula:

Depreciation = [(Cost - Scrap Value) / Total Production Units] x Production Units per Year

