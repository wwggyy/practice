package com.valor.practice.learn;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * @Description
 * @Author valor.wang
 * Date  2019-05-26 20:16
 **/
public class MainTest {
    public static void main(String[] args) {

        //函数式接口
        Functional f = ()->{
            System.out.println("f");
        };
        f.method();
        //接口默认方法与静态方法
        Defaulable defaulable = DefaulableFactory.create( DefaultableImpl::new );
        System.out.println( defaulable.notRequired() );
        defaulable = DefaulableFactory.create( OverridableImpl::new );
        System.out.println( defaulable.notRequired() );
        //方法引用
        //1
        final Car car = Car.create( Car::new );
        final List <Car> cars = Arrays.asList( car );
        final List <Studuent> studuents =
                Arrays.asList(new Studuent("jack",18));

        //2
        studuents.forEach( Car::collide );
        //3
        cars.forEach( Car::repair );
        //4
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );

        //重复注解
        for( RepeatingAnnotations.Filter filter: RepeatingAnnotations.Filterable.class.getAnnotationsByType(RepeatingAnnotations.Filter.class ) ) {
            System.out.println( filter.value() );
        }
        Studuent a = null;
        Studuent b = new Studuent("lilei",10);
        Optional optional = Optional.ofNullable(a);
        Studuent c = (Studuent)optional.orElse(b);
        System.out.println("name="+c.getName());



    }
}
