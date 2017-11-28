# AndroidViewPagerSkeleton

## Init nested ViewPager when fragment created

**Go to Fragment1**
```
Fragment1: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment3: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment4: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment5: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment1: setUserVisibleHint isVisibleToUser:true - isResumed:false
Fragment1: onCreateView
Fragment1: onStart
Fragment1: onResume
Fragment2: onCreateView
Fragment3: onCreateView
Fragment4: onCreateView
Fragment5: onCreateView
Fragment2: onStart
Fragment2: onResume
Fragment3: onStart
Fragment3: onResume
Fragment4: onStart
Fragment4: onResume
Fragment5: onStart
Fragment5: onResume
Fragment2a: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2a: setUserVisibleHint false - false
Fragment2b: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2b: setUserVisibleHint false - false
Fragment2a: setUserVisibleHint isVisibleToUser:true - isResumed:false
Fragment2a: setUserVisibleHint true - false
Fragment2a: onCreateView
Fragment2a: onStart
Fragment2a: onResume
Fragment2b: onCreateView
Fragment2b: onStart
Fragment2b: onResume
```
**Go to Fragment2**
```
Fragment1: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment2: setUserVisibleHint isVisibleToUser:true - isResumed:true
```
**Go to Fragment2b**
```
Fragment2c: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2c: setUserVisibleHint false - false
Fragment2a: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment2a: setUserVisibleHint false - true
Fragment2b: setUserVisibleHint isVisibleToUser:true - isResumed:true
Fragment2b: setUserVisibleHint true - true
Fragment2c: onCreateView
Fragment2c: onStart
Fragment2c: onResume
```
**Go to Fragment2c**
```
Fragment2b: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment2b: setUserVisibleHint false - true
Fragment2c: setUserVisibleHint isVisibleToUser:true - isResumed:true
Fragment2c: setUserVisibleHint true - true
Fragment2a: onStop
Fragment2a: onDestroyView
Fragment2a: onDestroyView
Fragment2a: onDestroy
Fragment2a: onDestroy
```
**Go to Fragment3**
```
Fragment2: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment3: setUserVisibleHint isVisibleToUser:true - isResumed:true
```

## Init nested ViewPager when fragment visible

**Go to Fragment1**
```
Fragment1: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment3: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment4: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment5: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment1: setUserVisibleHint isVisibleToUser:true - isResumed:false
Fragment1: onCreateView
Fragment1: onStart
Fragment1: onResume
Fragment2: onCreateView
Fragment3: onCreateView
Fragment4: onCreateView
Fragment5: onCreateView
Fragment2: onStart
Fragment2: onResume
Fragment3: onStart
Fragment3: onResume
Fragment4: onStart
Fragment4: onResume
Fragment5: onStart
Fragment5: onResume
```
**Go to Fragment2**
```
Fragment1: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment2: setUserVisibleHint isVisibleToUser:true - isResumed:true
Fragment2a: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2a: setUserVisibleHint false - false
Fragment2b: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2b: setUserVisibleHint false - false
Fragment2a: setUserVisibleHint isVisibleToUser:true - isResumed:false
Fragment2a: setUserVisibleHint true - false
Fragment2a: onCreateView
Fragment2a: onStart
Fragment2a: onResume
Fragment2b: onCreateView
Fragment2b: onStart
Fragment2b: onResume
```
**Go to Fragment2b**
```
Fragment2c: setUserVisibleHint isVisibleToUser:false - isResumed:false
Fragment2c: setUserVisibleHint false - false
Fragment2a: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment2a: setUserVisibleHint false - true
Fragment2b: setUserVisibleHint isVisibleToUser:true - isResumed:true
Fragment2b: setUserVisibleHint true - true
Fragment2c: onCreateView
Fragment2c: onStart
Fragment2c: onResume
```
**Go to Fragment2c**
```
Fragment2b: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment2b: setUserVisibleHint false - true
Fragment2c: setUserVisibleHint isVisibleToUser:true - isResumed:true
Fragment2c: setUserVisibleHint true - true
Fragment2a: onStop
Fragment2a: onDestroyView
Fragment2a: onDestroyView
Fragment2a: onDestroy
Fragment2a: onDestroy
```
**Go to Fragment3**
```
Fragment2: setUserVisibleHint isVisibleToUser:false - isResumed:true
Fragment3: setUserVisibleHint isVisibleToUser:true - isResumed:true
```