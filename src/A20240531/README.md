# ArrayList

底层使用 Object[] 数组存储 ， 

## new 后 数组的长度 -- 0

Shared empty array instance used for default sized empty instances. We distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when first element is added.

## 在一次添加后数组的长度

ArrayList 在添加时才开始增加长度 

`````Java
    /**
     * Increases the capacity to ensure that it can hold at least the
     * number of elements specified by the minimum capacity argument.
     *
     * @param minCapacity the desired minimum capacity
     * @throws OutOfMemoryError if minCapacity is less than zero
     */
    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

`````

第一次的长度会进行比较，如果大于 DEFAULT_CAPACITY（10） ， 则长度为 minCapacity ，反则为 DEFAULT_CAPACITY（10） 

