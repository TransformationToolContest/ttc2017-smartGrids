using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TTC2017.SmartGrids
{
    public class Tuple<T1, T2> : IEquatable<Tuple<T1, T2>>
    {
        public T1 Item1 { get; private set; }
        public T2 Item2 { get; private set; }

        public Tuple(T1 item1, T2 item2)
        {
            Item1 = item1;
            Item2 = item2;
        }
        public override bool Equals(object obj)
        {
            return Equals(obj as Tuple<T1, T2>);
        }
        public override int GetHashCode()
        {
            return (Item1 != null ? Item1.GetHashCode() : 0) ^ (Item2 != null ? Item2.GetHashCode() : 0);
        }

        public bool Equals(Tuple<T1, T2> other)
        {
            if (other == null) return false;
            return EqualityComparer<T1>.Default.Equals(Item1, other.Item1) &&
                EqualityComparer<T2>.Default.Equals(Item2, other.Item2);
        }
    }
    public class Tuple<T1, T2, T3> : IEquatable<Tuple<T1, T2, T3>>
    {
        public T1 Item1 { get; private set; }
        public T2 Item2 { get; private set; }
        public T3 Item3 { get; private set; }

        public Tuple(T1 item1, T2 item2, T3 item3)
        {
            Item1 = item1;
            Item2 = item2;
            Item3 = item3;
        }
        public override bool Equals(object obj)
        {
            return Equals(obj as Tuple<T1, T2, T3>);
        }
        public override int GetHashCode()
        {
            return (Item1 != null ? Item1.GetHashCode() : 0)
                ^ (Item2 != null ? Item2.GetHashCode() : 0)
                ^ (Item3 != null ? Item3.GetHashCode() : 0);
        }

        public bool Equals(Tuple<T1, T2, T3> other)
        {
            if (other == null) return false;
            return EqualityComparer<T1>.Default.Equals(Item1, other.Item1)
                && EqualityComparer<T2>.Default.Equals(Item2, other.Item2)
                && EqualityComparer<T3>.Default.Equals(Item3, other.Item3);
        }
    }
}
